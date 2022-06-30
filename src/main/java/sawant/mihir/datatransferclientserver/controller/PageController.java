package sawant.mihir.datatransferclientserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public record PageController() {


    @RequestMapping("/books/{name}/{id}")
    public String getBookById(@PathVariable String name,
                              @PathVariable Integer id, Model page){
        page.addAttribute("bookId", id);
        page.addAttribute("bookName", name);
        return "books";
    }

    @RequestMapping("/mobiles/price")
    public String getMobile(@RequestParam(required = false) Integer min,
                            @RequestParam(required = false) Integer max,
                            @RequestParam(required = false) Boolean isAvailable, Model model){
        model.addAttribute("minPrice", min);
        model.addAttribute("maxPrice", max);
        model.addAttribute("isAvailable", isAvailable);

        return "mobiles";
    }
}
