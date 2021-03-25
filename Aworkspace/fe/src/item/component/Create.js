import axios from "axios";
import React, { useState } from "react";
import { Link } from "react-router-dom";

const Create = () => {
    const [inputs, setInputs] = useState({
        itemBrand: "",
        itemName: "",
        modelNo: "",
        itemColor: "",
        releaseDate: "",
    });

    const { itemBrand, itemName, modelNo, itemColor, releaseDate, soldOut } = inputs;

    const handleChange = (e) => {
        const { value, name } = e.target;
        setInputs({
            ...inputs,
            [name]: value,
        });
    };

    const handleSubmit = (e) => {
        e.preventDefault();
        axios
            .post("http://localhost:8080/items", {
                itemBrand,
                itemName,
                modelNo,
                itemColor,
                releaseDate,
                soldOut,
            })
            .then((res) => {
                console.log(res);
            })
            .catch((err) => console.log(err));
    };

    return (
        <form onSubmit={handleSubmit} method="post">
            브랜드 : <input type="text" onChange={handleChange} name="itemBrand" value={itemBrand} />
            <br />
            모델번호 : <input type="text" onChange={handleChange} name="modelNo" value={modelNo} />
            <br />
            제품이름 : <input type="text" onChange={handleChange} name="itemName" value={itemName} />
            <br />
            색상 : <input type="text" onChange={handleChange} name="itemColor" value={itemColor} />
            <br />
            출시날짜 : <input type="text" onChange={handleChange} name="releaseDate" value={releaseDate} />
            <br />
            판매상태 : <input type="radio" onChange={handleChange} name="soldOut" value={soldOut} />
            <Link to="/items/list">
                <button type="submit">등록하기</button>
            </Link>
        </form>
    );
};

export default Create;
