# DATN_APP
MVC (Model View Controller) là một mô hình kiến trúc phần mềm khá phổ biến hiện nay. Mỗi thành phần sẽ đảm nhận một nhiệm vụ riêng biệt và hoạt động độc lập với các thành phần khác. Mô hình MVC chia ứng dụng thành 3 thành phần chính : Model, View và Controller .

Model

Model nghĩa là các dữ liệu cần thiết để hiển thị ở View. Model đại diện cho một tập hợp các lớp mô tả business logic (business model và data model). Nó cũng định nghĩa các business rules cho dữ liệu (nghĩa là cách mà dữ liệu thay đổi và được dùng)

View

View đại diện cho các thành phần UI như XML, HTML. View sẽ hiển thị dữ liệu đã qua xử lý từ Controller. Model và View tương tác với nhau qua Observer pattern .

Controller

Controller có trách nhiệm xử lý các yêu cầu (request) được gửi đến. Nó sẽ xử lý các dữ liệu của người dùng qua Model và trả về kết quả ở View .



![image](https://user-images.githubusercontent.com/90144686/209072352-f863859d-c994-49ff-8d4c-299939532ed5.png)
![image](https://user-images.githubusercontent.com/90144686/209072424-3c2d95f0-76dc-4afc-b0e8-240c7ed5de43.png)
