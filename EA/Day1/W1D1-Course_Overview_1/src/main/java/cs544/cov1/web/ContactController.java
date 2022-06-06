package cs544.cov1.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.validation.BindingResult;

import cs544.cov1.domain.Contact;
import cs544.cov1.domain.Email;
import cs544.cov1.domain.Phone;
import cs544.cov1.service.ContactService;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ContactController {

    @Resource
    private ContactService contactService;

    @RequestMapping(value = {"/contact"}, method = RequestMethod.GET)
    public String getAll(Model model) {
        model.addAttribute("contacts", contactService.getContacts());
        if (!model.containsAttribute("contact")) {
            model.addAttribute("contact", new Contact());
        }
        return "contactList";
    }

    @RequestMapping(value = "/contact", method = RequestMethod.POST)
    public String add(@Valid Contact contact, BindingResult result,
            RedirectAttributes attr) {
        if (result.hasErrors()) {
            attr.addFlashAttribute("org.springframework.validation.BindingResult.contact", result);
            attr.addFlashAttribute("contact", contact);
        } else {
            contactService.addContact(contact);
        }
        return "redirect:/contact";
    }

    @RequestMapping(value = "/contact/{id}", method = RequestMethod.GET)
    public String get(@PathVariable long id, Model model) {
        if (!model.containsAttribute("email")) {
            model.addAttribute("email", new Email());
        }
        if (!model.containsAttribute("phone")) {
            model.addAttribute("phone", new Phone());
        }
        if (!model.containsAttribute("contact")) {
            model.addAttribute("contact", contactService.getContact(id));
        }
        return "contactDetail";
    }

    @RequestMapping(value = "/contact/{id}", method = RequestMethod.POST)
    public String update(@ModelAttribute("contact") @Valid Contact contact,
            BindingResult result, @PathVariable long id, Model model,
            RedirectAttributes attr) {
        if (result.hasErrors()) {
            attr.addFlashAttribute("org.springframework.validation.BindingResult.contact", result);
            attr.addFlashAttribute("contact", contact);
            return "redirect:/contact/" + id;
        } else {
            contactService.updateContact(contact); // contact.id already set by binding
            return "redirect:/contact";
        }
    }

    @RequestMapping(value = "/contact/{id}/delete", method = RequestMethod.POST)
    public String delete(@PathVariable long id) {
        Contact c = contactService.getContact(id);
        contactService.deleteContact(c);
        return "redirect:/contact";
    }
}
