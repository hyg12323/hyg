package qulz;

import java.util.ArrayList;

public class GoodsCoupang {


ArrayList goodsTable = new ArrayList();
ArrayList cart Table Table = new ArrayList();
//굿즈를 추가
// 메소드명 : insert
//전달인자  : Goods
//리턴타입 : 없음


void insert(Goods goods) {
	goodsTable.add(goods);
}


// 굿즈 모두 출력
void selectAll() {
	for(int i=0; i<goodsTable.size(); i++) {
		Goods goods = (Goods)goodsTable.get(i);
		System.out.println(i+"번째 상품-----");
		System.out.println(goods.urlImage);
		System.out.println(goods.name);
		System.out.println(goods.price);
	}
}

//굿즈 하나 추출
// 메소드명 : seletOne
// 전달인자 : int index
// 리턴타입 : Goods // 선택된 굿즈 돌려주기

Goods selectOne(int index) {
	return (Goods)goodsTable.get(index);
}






// 카트에 굿즈 추가
// 메소드명 : addcart Table
// 전달인자 : int index
// 리턴타입 : void
void addcart Table(Goods goods) {

	Goods goods = selectOne(index);
	
	this.cart Table.add(goods);
}

//카트 모두 출력
 void selectcart TableAll{
	 for(int i=0; i<goodsTable.size(); i++) {
			Goods goods = (Goods)goodsTable.get(i);
			System.out.println(i+"번째 상품-----");
			System.out.println(goods.urlImage);
			System.out.println(goods.name);
			System.out.println(goods.price);
 }

}

