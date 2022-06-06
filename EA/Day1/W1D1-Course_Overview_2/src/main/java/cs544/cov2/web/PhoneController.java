package cs544.cov2.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cs544.cov2.domain.Contact;
import cs544.cov2.domain.Email;
import cs544.cov2.domain.Phone;
import cs544.cov2.service.ContactService;
import javax.validation.Valid;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class PhoneController {

    @Resource
    private ContactService contactService;

    @RequestMapping(value = "/contacts/{contactid}/addPhone", method = RequestMethod.POST)
    public String addPhone(@ModelAttribute("phone") @Valid Phone phone,
            BindingResult result, @PathVariable long contactid, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("contact", contactService.getContact(contactid));
            model.addAttribute("email", new Email());
            return "contactDetail";
        }
        Contact c = contactService.getContact(contactid);
        c.addPhone(phone);
        contactService.updateContact(c);
        return "redirect:/contacts/" + contactid;
    }

    @RequestMapping(value = "/contacts/{contactid}/removePhone", method = RequestMethod.POST)
    public String removePhone(Phone phone, @PathVariable long contactid) {
        Contact c = contactService.getContact(contactid);
        c.removePhone(phone);
        contactService.updateContact(c);
        return "redirect:/contacts/" + contactid;
    }

}
