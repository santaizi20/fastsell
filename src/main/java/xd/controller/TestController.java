package xd.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.parsing.SourceExtractor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xd.model.Cargo;
import xd.model.Type;
import xd.repository.CargoRepository;
import xd.repository.FoodRepository;
import xd.service.FoodService;
import xd.service.ItemService;
import xd.service.TypeService;
import xd.vo.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

/**
 * Created by mac on 2019/3/13.
 */
@RestController
public class TestController {
@Resource
    FoodService foodService;
    @Resource
    TypeService typeService;
@Resource
ItemService itemService;
   @RequestMapping("/test")
    public ResultVo test(){
       ResultVo resultVo=new ResultVo();
       ResultController.success(resultVo);
       resultVo.setData(itemService.findall());
       return resultVo;
   }
}
