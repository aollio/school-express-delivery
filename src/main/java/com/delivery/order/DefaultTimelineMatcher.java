package com.delivery.order;

import com.delivery.common.entity.UsersEntity;
import com.sun.corba.se.spi.servicecontext.UEInfoServiceContext;

import java.util.HashMap;
import java.util.Map;

/**
 * @author finderlo
 * @date 20/04/2017
 */
public class DefaultTimelineMatcher implements TimelineMatcher {


    /**
     * 订单匹配
     * @author finderlo
     * @date 21/04/2017
     */
    @Override
    public Map<String, String> timelineCondition(UsersEntity users) {
        String school = users.getUserSchoolname();
        String sex = users.getUserSex();

        Map<String,String> attr = new HashMap<>();

        attr.put("userSchoolname",school);
        attr.put("userSex",sex);
        return attr;
    }

}
