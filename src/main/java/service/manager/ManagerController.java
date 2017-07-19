package service.manager;

import model.Client;

import java.util.UUID;

public class ManagerController {

    //TODO: where we should put some validation things
    //TODO: where to store sql queries to get data from DB

    //@Autowired TODO: made by sprein IOC --> dependency injection
    private ManagerService managerService;

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

    //TODO: think which of REST will be better for deleting in different ways
    //@RequestMapping(value = "/delete/client/by/email/{clientEmail}", method = RequestMethod.POST)
    public String deleteClientByEmail(/*@PathVariable("contactId")*/ String email){

        managerService.removeClient(email);
        return "redirect:/index"; // TODO don't know what is it
    }
}
