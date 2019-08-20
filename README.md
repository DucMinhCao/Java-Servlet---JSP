# Java Servlet - JSP Tutorial

## Giới thiệu mô hình Client - Server
![](https://www.w3schools.in/wp-content/uploads/2019/01/client-server.jpg)    
Client muốn yêu cầu một thứ gì đó thì phải gửi Request tới Server, Server sau khi nhận Request thì sẽ gửi phản hồi Response lại cho Client


## Ưu điểm của Web so với Ứng dụng
### 🧮 Truy xuất thông tin dễ dàng hơn
- [x] Sử dụng HTTP nên việc truy xuất trở nên dễ dàng hơn so với việc phải cài App vào mới truy xuất được

### 🧮 Tiết kiệm thời gian và chi phí vận hành, bảo dưỡng
- [x] Nếu một ứng dụng bị lỗi thì phải cử người tới nơi để bảo trì, Web thì không cần làm như vậy

### 🔫 Sử dụng khắp mọi nơi nếu có Internet

### 🔎 Truy cập thông qua mobile dễ dàng, ở mọi nơi

### 🎉 Platform independecny
- [x] Với ứng dụng thông thường thì phải cung cấp bộ cài đặt khác nhau cho mỗi loại hệ điều hành (Mac, Linux, Windows)
- [x] Web thì không cần, chỉ cần có mạng là có thể dùng được

## 🎥 Kiến trúc mô hình lập trình Web
![](https://www.researchgate.net/profile/Youry_Khmelevsky/publication/226895919/figure/fig1/AS:302191094059009@1449059379533/The-Feasible-GIS-n-tier-Architecture.png)

## 🌞 POST vs GET
- [x] GET được dùng để lấy thông tin, GET bị giới hạn về kích thước
- [x] POST được dùng để gửi thông tin, không bị giới hạn về kích thước

## 🌞 Request Param
- [x] Request Param là thông tin mà người dùng nhập vào, thông tin này sẽ được gửi lên server để server xử lý

## 🌞 Tổng quan về Java Servlet
- [x] Servlet là một công nghệ dùng để lập trình Web để xử lý phía Server Side
## 🌞 doGet() vs doPost()
- [x] Tham Số : doGet() tham số được gán trong URL, doPost() tham số được gán trong phần thân
- [x] Kích thước dữ liệu : doGet() 240bytes, doPost() không giới hạn kích thước
- [x] Tham số : doGet() không được mã hóa, doPost() được mã hóa
- [x] Use : doGet() được dùng đa phần trong việc truy vấn hoặc lấy dữ liệu từ Server, doPost() được dùng đa phần trong việc update hoặc là post thông tin tới Server
- [x] Tốc độ : doGet() xử lý nhanh hơn doPost()
- [x] Bảo mật : doGet() cần được bảo mật, doPost() không cần bảo mật

## 😡 Nhược điểm của Servlet
- [x] Phải cấu hình rất là nhiều, từ phiên bản 3.0 Servlet hỗ trợ annotation nhưng vẫn còn phải cấu hình
- [x] Mỗi lần thay đổi Source code thì phải restart, recompile lại. Nếu dự án nhỏ thì không sao, nhưng nếu gặp dự án lớn thì rất bất lợi
- [x] Khó khăn trong việc chỉnh sửa code, thay vì viết code HTML bình thường thì Servlet phải wrap HTML code trong PrintWriter
- [x] Khó khăn trong việc chèn CSS code vào. Nếu ta sử dụng Bootstrap thì toang luôn
- [x] Những khó khăn này dẫn đến sự ra đời của JSP

## Practice Section
- [x] Simple Calculator (Add only)    
![](https://media.giphy.com/media/hs7oQFhNYPuUFsWDIQ/giphy.mp4)




