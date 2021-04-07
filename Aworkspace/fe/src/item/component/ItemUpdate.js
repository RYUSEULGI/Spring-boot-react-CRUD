import React, { useState, useEffect, useCallback } from 'react';
import axios from 'axios';
import { Link, useHistory } from 'react-router-dom';
import { updateItem } from '../../api/index';

const ItemUpdate = () => {
    const history = useHistory();
    const [detail, setDetail] = useState({});
    const fetchOne = () => {
        axios
            .get(
                `http://localhost:8080/items/item-number/${localStorage.getItem(
                    'select'
                )}`
            )
            .then((res) => {
                console.log(res);
                setDetail(res.data);
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
            const updateItemRequest = { ...detail };

            updateItem(updateItemRequest)
                .then((res) => {
                    console.log(res);
                    history.push('/items/list');
                })
                .catch((err) => console.log(err));
        },
        [detail, history]
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
                <input
                    type="text"
                    name="itemBrand"
                    value={detail.itemBrand}
                    onChange={handleChange}
                />
                <input
                    type="text"
                    name="modelNo"
                    value={detail.modelNo}
                    onChange={handleChange}
                />
                <input
                    type="text"
                    name="itemName"
                    value={detail.itemName}
                    onChange={handleChange}
                />
                <input
                    type="text"
                    name="itemColor"
                    value={detail.itemColor}
                    onChange={handleChange}
                />
                <input
                    type="text"
                    name="releaseDate"
                    value={detail.releaseDate}
                    onChange={handleChange}
                />
                <button type="submit">수정하기</button>
            </form>
            <Link to="/items/list">
                <button>목록으로</button>
            </Link>
        </>
    );
};

export default ItemUpdate;
