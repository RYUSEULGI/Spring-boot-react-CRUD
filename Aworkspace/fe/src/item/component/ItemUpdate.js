import React, { useState, useEffect, useCallback } from 'react';
import axios from 'axios';
import { Link } from 'react-router-dom';

const ItemUpdate = () => {
    const [detail, setDetail] = useState({});
    const { itemBrand, itemName, modelNo, itemColor, releaseDate } = detail;
    const fetchOne = () => {
        axios
            .get(`http://localhost:8080/items/item-number/${localStorage.getItem('select')}`)
            .then((res) => {
                console.log(res);
                setDetail({
                    itemBrand: res.data.itemBrand,
                    modelNo: res.data.modelNo,
                    itemName: res.data.itemName,
                    itemColor: res.data.itemColor,
                    releaseDate: res.data.releaseDate,
                });
            })
            .catch((err) => console.log(err));
    };

    useEffect(() => {
        fetchOne();
    }, []);

    const handleSubmit = useCallback(
        (e) => {
            e.preventDefault();
            console.log('update');
            axios
                .put(`http://localhost:8080/items/item-number/update/${localStorage.getItem('select')}`, {
                    itemBrand,
                    itemName,
                    modelNo,
                    itemColor,
                    releaseDate,
                })
                .then((res) => {
                    console.log(res);
                    window.location = '/items/list';
                })
                .catch((err) => console.log(err));
        },
        [itemBrand, itemColor, itemName, modelNo, releaseDate]
    );

    const handleChange = useCallback(
        (e) => {
            const { value, name } = e.target;
            setDetail({
                ...detail,
                [name]: value,
            });
        },
        [detail]
    );

    return (
        <>
            <h1>수정페이지</h1>
            <form onSubmit={handleSubmit} method="post">
                <input type="text" name="itemBrand" value={detail.itemBrand} onChange={handleChange} />
                <input type="text" name="modelNo" value={detail.modelNo} onChange={handleChange} />
                <input type="text" name="itemName" value={detail.itemName} onChange={handleChange} />
                <input type="text" name="itemColor" value={detail.itemColor} onChange={handleChange} />
                <input type="text" name="releaseDate" value={detail.releaseDate} onChange={handleChange} />
                <button type="submit">수정하기</button>
            </form>
            <Link to="/items/list">
                <button>목록으로</button>
            </Link>
        </>
    );
};

export default ItemUpdate;
