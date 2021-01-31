package com.tg.controller;

import com.tg.pojo.Books;
import com.tg.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
//controlle调用service
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;
    @RequestMapping("/allBook")
    //查询所有书籍
    public String list(Model model){
        List<Books> list = bookService.queryAllBook();
        model.addAttribute("list",list);
        //返回jsp页面
        return "allBook";
    }
    //跳转到增加书籍页面
    @RequestMapping("/toAddBook")
    public String toAddBook(){
        return "addBook";
    }
    @RequestMapping("/addBook")
    public String addBook(Books books){
        System.out.println("addBook=>"+books);
        bookService.addBook(books);
        return "redirect:/book/allBook";
    }
    //跳转到修改书籍页面
    @RequestMapping("/toUpdate")
    public String toUpdate(int id,Model model){
        Books books = bookService.queryBookById(id);
        model.addAttribute("Qbook",books);
        return "updateBook";
    }
    //修改书籍
    @RequestMapping("/updateBook")
    public  String updateBook(Books books){
        System.out.println("updateBook=>"+books);
        int i = bookService.updateBook(books);
        if(i>0){
            System.out.println("添加书籍成功"+books);
        }

        return "redirect:/book/allBook";
    }

    @RequestMapping("/deleteBook/{bookId}")
    public String deleteBook(@PathVariable("bookId") int id){
        bookService.deleteBookById(id);
        return "redirect:/book/allBook";
    }
    @RequestMapping("/queryBook")
    public String queryBook(String queryBookName,Model model){
        Books books = bookService.queryBookByName(queryBookName);
        System.err.println("queryBook"+books);
        List<Books> list=new ArrayList<Books>();
        list.add(books);
        if(list==null){
            list=bookService.queryAllBook();
            model.addAttribute("err","未查到该书籍");
        }

        model.addAttribute("list",list);
        //返回jsp页面
        return "allBook";
    }
}
