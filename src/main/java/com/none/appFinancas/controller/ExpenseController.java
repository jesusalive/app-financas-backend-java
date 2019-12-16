package com.none.appFinancas.controller;

import com.none.appFinancas.dto.ExpenseFormDTO;
import com.none.appFinancas.dto.ExpenseDTO;
import com.none.appFinancas.service.ExpenseService;
import com.none.appFinancas.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ExpenseController {

    @Autowired
    private ExpenseService outsService;

    @Autowired
    private UserService userService;

    @GetMapping("/outs/{userId}")
    public List<ExpenseDTO> getAllUserOuts(@PathVariable Long userId){
        return outsService.allUserOuts(userId);
    }

    @PostMapping("/outs")
    public Object createOut(@RequestBody ExpenseFormDTO out){
        return outsService.createOut(out.getUserId(), out.getReason(), out.getValue(), out.getDate());
    }

    @DeleteMapping("/outs/{outId}")
    public void deleteOut(@PathVariable Long outId){
        outsService.deleteOut(outId);
    }

}