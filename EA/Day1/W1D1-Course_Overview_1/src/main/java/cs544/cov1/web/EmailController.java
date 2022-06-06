package cs544.cov1.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cs544.cov1.domain.Contact;
import cs544.cov1.domain.Email;
import cs544.cov1.service.ContactService;
import javax.validation.Valid;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class EmailController {

    @Resource
    private ContactService contactService;

    @RequestMapping(value = "/contact/{contactid}/addEmail", method = RequestMethod.POST)
    public String addPhone(@ModelAttribute("email") @Valid Email email,
            BindingResult result, @PathVariable long contactid, Model model, 
            RedirectAttributes attr) {
        if (result.hasErrors()) {
            attr.addFlashAttribute("org.springframework.validation.BindingResult.email", result);
            attr.addFlashAttribute("email", email);            
        } else {
            Contact c = contactService.getContact(contactid);
            c.addEmail(email);
            contactService.updateContact(c);
        }
        return "redirect:/contact/" + contactid;
    }

    @RequestMapping(value = "/contact/{contactid}/removeEmail", method = RequestMethod.POST)
    public String removePhone(Email email, @PathVariable long contactid) {
        Contact c = contactService.getContact(contactid);
        c.removeEmail(email);
        contactService.updateContact(c);
        return "redirect:/contact/" + contactid;
    }

}
