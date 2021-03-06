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
                placeholder="λΈλλ"
                required
            />
            <input
                type="text"
                onChange={handleChange}
                name="modelNo"
                value={modelNo}
                placeholder="λͺ¨λΈλ²νΈ"
                required
            />
            <input
                type="text"
                onChange={handleChange}
                name="itemName"
                value={itemName}
                placeholder="μ΄λ¦"
                required
            />
            <input
                type="text"
                onChange={handleChange}
                name="itemColor"
                value={itemColor}
                placeholder="μμ"
                required
            />
            <input
                type="text"
                onChange={handleChange}
                name="releaseDate"
                value={releaseDate}
                placeholder="μΆμλ μ§"
                required
            />
            νλ§€ :{' '}
            <input
                type="checkbox"
                onChange={handleChange}
                name="soldOut"
                value={soldOut}
                placeholder="μν"
                required
            />
            <button type="submit">λ±λ‘νκΈ°</button>
        </form>
    );
};

export default Create;
