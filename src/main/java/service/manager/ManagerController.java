package service.manager;

import model.Client;

import java.util.UUID;

public class ManagerController {

    //@Autowired TODO: made by sprein IOC --> dependency injection
    private ManagerService managerService;

//    Client findClient(String name, String lastName);
//    Client findClient(String email);
//    Client findClientByPhone(String phone);
//    Client removeClient();
//
//    //operation with application
//    VisaApplication findApplication(UUID id);

    //@RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addClient(/*@ModelAttribute("contact")*/ Client client
                            /*BindingResult result*/){

        managerService.addClient(client);
        return "redirect:/index"; // TODO don't know what is it
    }

    //@RequestMapping(value = "/delete/client/{clientId}", method = RequestMethod.POST)
    public String deleteClient(/*@PathVariable("contactId")*/ String contactId){

        managerService.removeClient(UUID.fromString(contactId));
        return "redirect:/index"; // TODO don't know what is it
    }

    //@RequestMapping(value = "/delete/client/by/email/{clientEmail}", method = RequestMethod.POST)
    public String deleteClientByEmail(/*@PathVariable("contactId")*/ String email){

        managerService.removeClient(email);
        return "redirect:/index"; // TODO don't know what is it
    }
}
