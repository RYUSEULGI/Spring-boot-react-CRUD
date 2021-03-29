import React, { useState, useEffect, useCallback } from 'react';
import { Link } from 'react-router-dom';
import axios from 'axios';

const ItemRead = (props) => {
    const [detail, setDetail] = useState({});

    const fetchOne = () => {
        axios
            .get(`http://localhost:8080/items/item-number/${localStorage.getItem('select')}`)
            .then((res) => {
                console.log(res);
                setDetail(res.data);
            })
            .catch((err) => console.log(err));
    };

    useEffect(() => {
        fetchOne();
    }, []);

    const handleDelete = useCallback(() => {
        if (window.confirm('정말 삭제하곘습니까?')) {
            console.log(`삭제:${detail.itemNo}`);
            axios
                .delete(`http://localhost:8080/items/item-number/delete/${localStorage.getItem('select')}`)
                .then((res) => {
                    console.log(res);
                    window.location = '/items/list';
                })
                .catch((err) => console.log(err));
        }
    }, [detail.itemNo]);

    return (
        <div>
            <table>
                <thead>
                    <tr>
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
                        <td>{detail.itemBrand}</td>
                        <td>{detail.modelNo}</td>
                        <td>{detail.itemName}</td>
                        <td>{detail.itemColor}</td>
                        <td>{detail.releaseDate}</td>
                        <td>{detail.soldOut}</td>
                    </tr>
                </tbody>
            </table>
            <Link to={`/items/item-number/${detail.itemNo}/update`}>
                <button>수정하기</button>
            </Link>
            <button method="Post" onClick={handleDelete}>
                삭제하기
            </button>
            <Link to="/items/list">
                <button>목록으로</button>
            </Link>
        </div>
    );
};

export default ItemRead;
