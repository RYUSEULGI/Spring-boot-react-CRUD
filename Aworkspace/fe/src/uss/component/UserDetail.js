import React from 'react';
import '../css/UserDetail.css';

const UserDetail = () => (
    <>
        <div class="titleArea">
            <h2>mypage</h2>
            <div class="information">***님</div>
        </div>

        <div id="myshopMain">
            <ul>
                <li class="shopMain order">
                    <div class="box">
                        <a href="!#">
                            <h3>
                                <strong>Order</strong>
                                <span>주문내역 조회</span>
                            </h3>
                            <p>
                                고객님께서 주문하신 상품의
                                <br />
                                주문내역을 확인하실 수 있습니다.
                            </p>
                        </a>
                    </div>
                </li>
                <li class="shopMain profile">
                    <div class="box">
                        <a href="!#">
                            <h3>
                                <strong>Profile</strong>
                                <span>회원 정보</span>
                            </h3>
                            <p>
                                회원이신 고객님의 개인정보를
                                <br />
                                관리하는 공간입니다.
                            </p>
                        </a>
                    </div>
                </li>
            </ul>
        </div>
    </>
);

export default UserDetail;
