import { Link } from 'react-router-dom';
import React, { useEffect, useState } from 'react';
import axios from 'axios';
import ListForm from './ListForm';
import Pagination from './Pagination';

const ItemLilst = () => {
    const [list, setList] = useState([]);

    const [current, setCurrent] = useState(1);
    const [postOnePage] = useState(5);

    const lastIdx = current * postOnePage;
    const firstIdx = lastIdx - postOnePage;
    const currentIdx = list.slice(firstIdx, lastIdx);

    const paginate = (pageNum) => setCurrent(pageNum);

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
            <ListForm list={currentIdx} />
            <Pagination paginate={paginate} postOnePage={postOnePage} total={list.length} />
            <Link to="/items/create">
                <button>등록</button>
            </Link>
        </>
    );
};

export default ItemLilst;
