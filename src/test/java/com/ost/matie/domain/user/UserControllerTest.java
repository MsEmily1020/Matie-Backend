package com.ost.matie.domain.user;

import com.epages.restdocs.apispec.ResourceSnippetParameters;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ost.matie.domain.user.dto.AddUserRequest;
import com.ost.matie.domain.user.dto.LoginUserRequest;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static com.epages.restdocs.apispec.ResourceDocumentation.resource;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.post;
import static org.springframework.restdocs.operation.preprocess.Preprocessors.*;
import static org.springframework.restdocs.payload.PayloadDocumentation.fieldWithPath;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureRestDocs
@AutoConfigureMockMvc
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class UserControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    @Autowired
    UserController userController;

    @Test
    @Order(1)
    @DisplayName("1. addUser() : 사용자를 추가합니다.")
    void addUser() throws Exception {
        AddUserRequest request = new AddUserRequest(
                "nickname",
                "hyeseung22",
                "peace10200khs@e-mirim.hs.kr1",
                "hyeseung2!"
        );

        mockMvc.perform(
                        post("/user")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(objectMapper.writeValueAsString(request))
                )
                .andExpect(status().isCreated())
                .andDo(print())
                .andDo(
                        document("user-post",
                                preprocessRequest(prettyPrint()),
                                preprocessResponse(prettyPrint()),
                                resource(
                                        ResourceSnippetParameters.builder()
                                                .description("회원가입할 수 있습니다.")
                                                .summary("회원가입 하기")
                                                .requestFields(
                                                        fieldWithPath("name").description("사용자 이름"),
                                                        fieldWithPath("userId").description("사용자 아이디"),
                                                        fieldWithPath("email").description("사용자 이메일"),
                                                        fieldWithPath("pw").description("사용자 비밀번호")
                                                )
                                                .build()
                                )
                        )
                );
    }

    @Test
    @Order(2)
    @DisplayName("2. loginUser() : 사용자를 로그인합니다.")
    void loginUser() throws Exception {
        LoginUserRequest request = new LoginUserRequest("hyeseung", "hyeseung1!");

        mockMvc.perform(
                        post("/user/login")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(objectMapper.writeValueAsString(request))
                )
                .andExpect(status().isOk())
                .andDo(print())
                .andDo(
                        document("user-login",
                                preprocessRequest(prettyPrint()),
                                preprocessResponse(prettyPrint()),
                                resource(
                                        ResourceSnippetParameters.builder()
                                        .description("로그인 할 수 있습니다.")
                                                .summary("로그인 하기")
                                                .requestFields(
                                                        fieldWithPath("userId").description("사용자 아이디"),
                                                        fieldWithPath("pw").description("사용자 비밀번호")
                                                )
                                                .responseFields(
                                                        fieldWithPath("id").description("사용자 id"),
                                                        fieldWithPath("name").description("사용자 이름"),
                                                        fieldWithPath("userId").description("사용자 아이디"),
                                                        fieldWithPath("email").description("사용자 이메일"),
                                                        fieldWithPath("createdDate").description("사용자 등록 일자")
                                                )
                                                .build()
                                )
                        )
                );
    }

    @Test
    void findByUser() {
    }

    @Test
    void checkDuplicateEmail() {
    }

    @Test
    void checkDuplicateUserId() {
    }

    @Test
    void updateUser() {
    }

    @Test
    void deleteUser() {
    }
}