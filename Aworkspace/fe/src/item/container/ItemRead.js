import React, { useState, useEffect } from "react";
import { Link } from "react-router-dom";
import axios from "axios";

const ItemRead = (props) => {
    const [detail, setDetail] = useState({});
    const fetchOne = () => {
        axios
            .get(`http://localhost:8080/items/item-number/${localStorage.getItem("select")}`)
            .then((res) => {
                console.log(res);
                setDetail(res.data);
            })
            .catch((err) => console.log(err));
    };

    useEffect(() => {
        fetchOne();
    }, []);

    return (
        <div>
            <table>
                <thead>
                    <tr>
                        <th>No</th>
                        <th>브랜드</th>
                        <th>모델번호</th>
                        <th>이름</th>
                        <th>색상</th>
                        <th>출시날짜</th>
                        <th>판매</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>{detail.id}</td>
                        <td>{detail.itemBrand}</td>
                        <td>{detail.modelNo}</td>
                        <td>{detail.itemName}</td>
                        <td>{detail.itemColor}</td>
                        <td>{detail.releaseDate}</td>
                        <td>{detail.soldOut}</td>
                    </tr>
                </tbody>
            </table>
            <Link to="/items/list">
                <button>수정하기</button>
            </Link>
            <Link to="/items/list">
                <button>목록으로</button>
            </Link>
        </div>
    );
};

export default ItemRead;
