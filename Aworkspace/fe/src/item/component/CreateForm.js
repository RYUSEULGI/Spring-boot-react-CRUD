import React, { useState, useCallback, useEffect } from 'react';
import { useHistory } from 'react-router';
import { createItem } from '../../api/index';

const Create = () => {
    const history = useHistory();
    const [inputs, setInputs] = useState({
        itemBrand: '',
        itemName: '',
        modelNo: '',
        itemColor: '',
        releaseDate: '',
    });

    const {
        itemBrand,
        itemName,
        modelNo,
        itemColor,
        releaseDate,
        soldOut,
    } = inputs;

    const handleChange = useCallback(
        (e) => {
            const { value, name } = e.target;
            setInputs({
                ...inputs,
                [name]: value,
            });
        },
        [inputs]
    );

    const handleSubmit = useCallback(
        (e) => {
            e.preventDefault();
            const createItemRequest = { ...inputs };

            createItem(createItemRequest)
                .then((res) => {
                    console.log(res);
                    history.push('/items/list');
                })
                .catch((err) => console.log(err));
        },
        [history, inputs]
    );

    const handleBeforeunload = (e) => {
        if (handleChange) {
            e.preventDefault();
            e.returnValue = '';

            return '';
        }
        return undefined;
    };
    useEffect(() => {
        window.addEventListener('beforeunload', handleBeforeunload);

        return () => {
            window.removeEventListener('beforeunload', handleBeforeunload);
        };
    }, [handleChange]);

    return (
        <form onSubmit={handleSubmit} method="post">
            <input
                type="text"
                onChange={handleChange}
                name="itemBrand"
                value={itemBrand}
                placeholder="브랜드"
                required
            />
            <input
                type="text"
                onChange={handleChange}
                name="modelNo"
                value={modelNo}
                placeholder="모델번호"
                required
            />
            <input
                type="text"
                onChange={handleChange}
                name="itemName"
                value={itemName}
                placeholder="이름"
                required
            />
            <input
                type="text"
                onChange={handleChange}
                name="itemColor"
                value={itemColor}
                placeholder="색상"
                required
            />
            <input
                type="text"
                onChange={handleChange}
                name="releaseDate"
                value={releaseDate}
                placeholder="출시날짜"
                required
            />
            판매 :{' '}
            <input
                type="checkbox"
                onChange={handleChange}
                name="soldOut"
                value={soldOut}
                placeholder="상태"
                required
            />
            <button type="submit">등록하기</button>
        </form>
    );
};

export default Create;
