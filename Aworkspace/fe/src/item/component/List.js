import React, { useState, useEffect } from "react";
import axios from "axios";
import { Link } from "react-router-dom";
import "../css/List.css";

const List = () => {
    const [list, setList] = useState([]);
    const fetchList = () => {
        axios
            .get("http://localhost:8080/items/list")
            .then((res) => {
                console.log(res);
                setList(res.data);
            })
            .catch((err) => {
                console.log(err);
                console.log(err.data);
            });
    };
    useEffect(() => {
        fetchList();
    }, []);

    const handleOnClick = (e) => {
        e.preventDefault();
    };

    return list.map((item) => {
        return (
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
                        <th>보기</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td key={item.itemNo}>{item.itemNo}</td>
                        <td>{item.itemBrand}</td>
                        <td>{item.modelNo}</td>
                        <td>{item.itemName}</td>
                        <td>{item.itemColor}</td>
                        <td>{item.releaseDate}</td>
                        <td>{item.soldOut}</td>
                        <td>
                            <Link to={`/items/item-number/${item.itemNo}`} className="linkto-item">
                                <button
                                    onClick={() => {
                                        console.log(`${item.itemNo}`);
                                        localStorage.setItem("select", `${item.itemNo}`);
                                    }}
                                >
                                    자세히보기
                                </button>
                            </Link>
                        </td>
                    </tr>
                </tbody>
            </table>
        );
    });
};
export default List;
