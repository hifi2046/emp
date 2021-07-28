package hifi;

import hifi.mapper.HrMapper;
import hifi.model.Hr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.alibaba.fastjson.*;

import java.util.List;

@Service
public class HrService {
    public String hr () {
        @Autowired
        HrMapper mapper;
        List<Hr> res=mapper.getAllHrs(1,"");
        return JSONArray.toJSON(res).toString();
    }
}
