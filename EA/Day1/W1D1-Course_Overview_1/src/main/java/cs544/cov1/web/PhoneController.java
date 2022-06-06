package cs544.cov1.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cs544.cov1.domain.Contact;
import cs544.cov1.domain.Phone;
import cs544.cov1.service.ContactService;
import javax.validation.Valid;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class PhoneController {

    @Resource
    private ContactService contactService;

    @RequestMapping(value = "/contact/{contactid}/addPhone", method = RequestMethod.POST)
    public String addPhone(@ModelAttribute("phone") @Valid Phone phone,
            BindingResult result, @PathVariable long contactid, Model model,
            RedirectAttributes attr) {
        if (result.hasErrors()) {
            attr.addFlashAttribute("org.springframework.validation.BindingResult.phone", result);
            attr.addFlashAttribute("phone", phone);
        } else {
            Contact c = contactService.getContact(contactid);
            c.addPhone(phone);
            contactService.updateContact(c);
        }
        return "redirect:/contact/" + contactid;
    }

    @RequestMapping(value = "/contact/{contactid}/removePhone", method = RequestMethod.POST)
    public String removePhone(Phone phone, @PathVariable long contactid) {
        Contact c = contactService.getContact(contactid);
        c.removePhone(phone);
        contactService.updateContact(c);
        return "redirect:/contact/" + contactid;
    }

}
