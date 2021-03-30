import { Link } from 'react-router-dom';
import React, { useEffect, useState } from 'react';
import axios from 'axios';
import ListForm from './ListForm';
import Pagination from './Pagination';

const ItemLilst = () => {
    const [list, setList] = useState([]);

    const fetchList = () => {
        axios
            .get('http://localhost:8080/items/list')
            .then((res) => {
                console.log(res);
                setList(res.data);
            })
            .catch((err) => {
                console.log(err);
            });
    };

    useEffect(() => {
        console.log('rendering');
        fetchList();
    }, []);

    return (
        <>
            <h1>ItemList Page</h1>
            <ListForm list={list} />
            <Pagination />
            <Link to="/items/create">
                <button>등록</button>
            </Link>
        </>
    );
};

export default ItemLilst;
