import axios from "axios";
import React, { useState } from "react";

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
        console.log("작동");
        axios
            .post("http://localhost:8080/items", {
                itemBrand,
                itemName,
                modelNo,
                itemColor,
                releaseDate,
                soldOut,
            })
            .then((res) => console.log(res))
            .catch((err) => console.log(err));
    };

    return (
        <form onSubmit={handleSubmit} method="post">
            <input type="text" onChange={handleChange} name="itemBrand" value={itemBrand} placeholder="브랜드" />
            <input type="text" onChange={handleChange} name="modelNo" value={modelNo} placeholder="모델번호" />
            <input type="text" onChange={handleChange} name="itemName" value={itemName} placeholder="이름" />
            <input type="text" onChange={handleChange} name="itemColor" value={itemColor} placeholder="색상" />
            <input type="text" onChange={handleChange} name="releaseDate" value={releaseDate} placeholder="출시날짜" />
            <input type="radio" onChange={handleChange} name="soldOut" value={soldOut} placeholder="상태" />
            <button type="submit">등록하기</button>
        </form>
    );
};

export default Create;
