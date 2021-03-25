import axios from "axios";
import React, { useState, useEffect } from "react";
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
            .catch((err) => console.log(err));
    };

    useEffect(() => {
        fetchList();
    }, []);

    return list.map((item) => {
        return (
            <Link to="/items/detail" className="linkto-item">
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
                            <td>{item.itemNo}</td>
                            <td>{item.itemBrand}</td>
                            <td>{item.modelNo}</td>
                            <td>{item.itemName}</td>
                            <td>{item.itemColor}</td>
                            <td>{item.releaseDate}</td>
                            <td>{item.soldOut}</td>
                        </tr>
                    </tbody>
                </table>
            </Link>
        );
    });
};

export default List;
