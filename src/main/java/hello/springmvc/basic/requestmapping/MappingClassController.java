package hello.springmvc.basic.requestmapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class MappingClassController {
    /*
        회원 목록 조회: GET /users
        회원 등록: POST /users
        회원 조회: GET /users/{userId}
        회원 수정: PATCH /users/{userId}
        회원 삭제: DELETE /users/{userId}
    * */
    public String user() {
        return "get users";
    }

    public String addUser() {
        return "post user";
    }
}
