@demo1
Feature: Lookup a definition
  In order to talk better
  As an English student
  I want to look up word definitions
  Scenario: Login Tiki
  	Given the user is on the Tiki home page
  	When user navigate to login page
		Then user enter username 'ngocdollars@gmail.com' and password 'hoabich96@' 
 #		When user choose group as 'Sách, VPP & Quà Tặng'
 #		When user choose group as 'Sách tiếng Việt'
#		When user choose group as 'Sách kỹ năng sống'
		Given user navigate product list
		When user choose group as 'BÁN CHẠY'
		Then user buy a product as 'Đắc Nhân Tâm (Khổ Lớn)'
		When user enter mount product buy as '5'
		Then user click button 'CHỌN MUA'
		Then user click button 'Xem giỏ hàng và thanh toán'
		Then user click button 'Tiến hành đặt hàng'
		When user enter infor ship as 'Ngoc' '0989343892' 'Ha Noi' 'Quận Cầu Giấy' 'Phường Dịch Vọng Hậu' '3 duy tan' '2'
		Then user choose payment method as 'Thanh toán tiền mặt khi nhận hàng'
#	And user click button order 'ĐẶT MUA'