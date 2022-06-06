package cs544.cov2.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.validation.BindingResult;

import cs544.cov2.domain.Contact;
import cs544.cov2.domain.Email;
import cs544.cov2.domain.Phone;
import cs544.cov2.service.ContactService;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class ContactController {

    @Resource
    private ContactService contactService;

    @RequestMapping("/")
    public String redirectRoot() {
        return "redirect:/contacts";
    }

    @RequestMapping(value = "/contacts", method = RequestMethod.GET)
    public String getAll(Model model) {
        model.addAttribute("contacts", contactService.getContacts());
        model.addAttribute("contact", new Contact());
        return "contactList";
    }

    @RequestMapping(value = "/contacts", method = RequestMethod.POST)
    public String add(@Valid Contact contact, BindingResult result) {
        if (result.hasErrors()) {
            return "contactList";
        }
        contactService.addContact(contact);
        return "redirect:/contacts";
    }

    @RequestMapping(value = "/contacts/{id}", method = RequestMethod.GET)
    public String get(@PathVariable long id, Model model) {
        model.addAttribute("contact", contactService.getContact(id));
        model.addAttribute("phone", new Phone());
        model.addAttribute("email", new Email());
        return "contactDetail";
    }

    @RequestMapping(value = "/contacts/{id}", method = RequestMethod.POST)
    public String update(@ModelAttribute("contact") @Valid Contact contact, 
            BindingResult result, @PathVariable long id, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("phone", new Phone());
            model.addAttribute("email", new Email());
            return "contactDetail";
        }
        contactService.updateContact(contact); // contact.id already set by binding
        return "redirect:/contacts";
    }

    @RequestMapping(value = "/contacts/delete/{id}", method = RequestMethod.POST)
    public String delete(@PathVariable long id) {
        Contact c = contactService.getContact(id);
        contactService.deleteContact(c);
        return "redirect:/contacts";
    }
}
