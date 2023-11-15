# The-Last-Passenger
Based on gameshow "Hành Khách Cuối Cùng".
Create a program for the game The Last Passenger using OOP. The description of the game is as follows: 
1) Phần chơi « Ghi nhớ bước chân » trong gameshow Hành Khách cuối cùng với luật chơi sau : Các người chơi đặt chân lên ma trận ô vuông 5x3. Mỗi hàng có 3 ô màu xanh, vàng, đỏ. Người chơi phải có nhiệm vụ đặt chân đúng màu đã chọn qua đủ 5 hàng. Điểm số của người chơi được tính theo số hàng liên tiếp người đó đặt chân đúng ô màu đã chọn.  
Viết chương trình mô phỏng trò chơi trên, được điều khiển bằng menu với các chức năng tương ứng với từng bước sau. Chú ý là khi mỗi chức năng được thực hiện xong thì chương trình phải quay về menu chính
1)	Tạo ma trận ô màu. Chương trình tạo ra ma trận các ô vuông tương ứng với hình vẽ sau.
Xanh	Vàng	Đỏ
Vàng	Đỏ	Xanh
Đỏ	Vàng	Xanh
Xanh	Đỏ	Vàng
Vàng	Đỏ	Xanh
	In ma trận ra màn hình.
2)	Thay đổi ma trận. Chương trình liên tục yêu cầu người dùng cho biết hàng cột của ô cần đổi màu cho đến khi nhận giá trị hợp lệ. Người dùng nhập màu mới cho ô  (0 – Xanh, 1- Vàng, 2 Đỏ), nếu màu này trùng với màu của ô hoặc màu không hợp lệ thì yêu cầu nhập lại. Nếu không thì thì hoán đổi 2 ô màu tương ứng trên hàng đó (Ví dụ đổi màu cho ô hàng 3 cột 2 thành màu Xanh thì hai ô ở tọa độ 3,2 và 3,3 đổi chỗ cho nhau). Sau khi thay đổi in lại ma trận.
3)	Thực hiện chơi. Có tất cả 4 người chơi. Chương trình liên tục:
-	Hỏi tên người chơi. Chỉnh tên của người chơi theo đúng quy định các chữ cái đầu mỗi thành phần là chữ Hoa. Ví dụ Nguyễn Xuân Nguyên. Giả sử rằng người dùng nhập tên theo đúng quy định về số dấu cách ở giữa Họ tên đêm và tên luôn là 1.
-	Hỏi màu mà người chơi lựa chọn: 0 – Xanh, 1- Vàng – 2 Đỏ
-	Liên tục hỏi ô mà người chơi sẽ đặt chân trên các hàng. Nếu người dùng đặt sai hoặc qua hết 5 hàng thì lưu lại điểm số và chuyển sang người chơi tiếp theo. 
-	Khi chơi hết 4 người thì quay về menu
4)	Hiển thị kết quả: In ra bảng kết quả theo thứ tự từng người chơi dưới dạng sau
Lượt chơi      Người chơi      Màu lựa chọn   Điểm
1                   Hoàng Hùng     Đỏ                    2
2                   Vũ Tuấn Anh    Vàng                5
3                   Phạm Hằng       Xanh                1    
5)	In ra người chơi có số điểm cao nhất và thấp nhất.
     
Một số gợi ý
- Có thể dùng mảng hai chiều để lưu trạng thái các ô màu. Chú ý là chỉ số mảng bắt đầu từ 0 – với người chơi thì các ô nằm trong tọa độ tính từ 1.
- Lưu thông tin về người chơi trong các biến kiểu cấu trúc với các trường: tên, màu, điểm.
- Có giao diện đồ họa trực quan là điểm cộng
