package edu.miu.springdata1.controller;

import edu.miu.springdata1.entity.User;
import edu.miu.springdata1.model.PagingRequest;
import edu.miu.springdata1.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/paging")
    public Page<User> paging(@RequestBody PagingRequest pagingRequest) {
        return userService.paging(pagingRequest);
    }

}
