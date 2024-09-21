package mosbach.dhbw.de.cftestbackend.controller;

import mosbach.dhbw.de.cftestbackend.model.Logik.Service;

import java.util.List;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/service")

public class ServiceController {
    public List<Service> getAlleSerivce() {

        //return Dienstleistung.getAlle();
        return List.of();
    }
}
