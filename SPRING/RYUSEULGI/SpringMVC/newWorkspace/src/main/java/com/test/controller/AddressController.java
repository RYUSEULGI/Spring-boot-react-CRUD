package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.test.domain.Address;
import com.test.service.AddressService;

@Controller
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping("/list.do")
    public ModelAndView list() {
        List<Address> list = addressService.list();

        ModelAndView mv = new ModelAndView("address/list", "list", list);

        return mv;
    }

    @GetMapping("/write.do")
    public String write() {
        return "address/write";
    }

    @PostMapping("/write.do")
    public String write(Address address) {
        addressService.insert(address);

        return "redirect:list.do";
    }

    @GetMapping("/del.do")
    public String delete(long seq) {
        addressService.delete(seq);

        return "redirect:list.do";
    }
}
