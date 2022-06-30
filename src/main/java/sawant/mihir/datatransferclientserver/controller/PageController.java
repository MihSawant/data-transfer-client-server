package sawant.mihir.datatransferclientserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public record PageController() {


    @RequestMapping("/books/{name}/{id}")
    public String getBookById(@PathVariable String name,
                              @PathVariable Integer id, Model page){
        page.addAttribute("bookId", id);
        page.addAttribute("bookName", name);
        return "books";
    }
}
