package com.ssak.web.Controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssak.web.Service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/user/List")
	public String CoworkList(HttpServletRequest request, HttpSession session ,Model model) throws Exception {

		String userList = null;
		
		StringBuffer response = new StringBuffer();
		
		try {
            URL url = new URL("http://54.82.33.140:8080/RestAPI/user"); // 호출할 URL
            HttpURLConnection conn = (HttpURLConnection)url.openConnection();
 
            conn.setRequestMethod("GET");
            
            conn.setRequestProperty("Content-Type", "application/json");
            
            conn.setDoOutput(true);
            
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
            
            String inputLine;
            
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            
            in.close();
            
            // 응답받은 Json결과를 parser하여 String으로 출력
            System.out.println(response.toString()); 
            
            userList = response.toString();
 
        } catch (Exception e) {
            e.printStackTrace();
        }
		
		// List<UserVO> userList = userService.SelectAllUser();
		
		// JSON Parse 선언
		JSONParser parser = new JSONParser();
		
		// 오브젝트 생성하여 String 처리한 Json 결과를 담음
		Object obj = parser.parse(userList);
		
		System.out.println(obj);
		
		// 모델 객체에 오브젝트를 담음
		model.addAttribute("userList",obj);
		
		return "user/userList";
	}
	
}
