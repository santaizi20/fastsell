package xd.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xd.model.Cargo;
import xd.repository.CargoRepository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by mac on 2019/3/13.
 */
@RestController
public class TestController {
@Resource
    CargoRepository cargoRepository;


    @RequestMapping("/aaa")
    public String test(){
        return "hello!";
    }

//    @RequestMapping("/bbb")
//    public List<Cargo> test2(){
//       List<Cargo> c= (List<Cargo>) cargoRepository.findAll();
//        return c;
//    }
}
