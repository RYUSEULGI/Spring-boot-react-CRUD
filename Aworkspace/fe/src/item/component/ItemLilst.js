import { Link } from 'react-router-dom';
import React, { useEffect, useState } from 'react';
import ListForm from './ListForm';
import Pagination from './Pagination';
import { fetchItemList } from '../../api/index';

const ItemLilst = () => {
    const [list, setList] = useState([]);

    const [current, setCurrent] = useState(1);
    const [postOnePage] = useState(5);

    const lastIdx = current * postOnePage;
    const firstIdx = lastIdx - postOnePage;
    const currentIdx = list.slice(firstIdx, lastIdx);

    const paginate = (pageNum) => setCurrent(pageNum);

    useEffect(() => {
        fetchItemList()
            .then((res) => {
                console.log(res);
                setList(res.data);
            })
            .catch((err) => {
                console.log(err);
            });
    }, []);

    return (
        <>
            <h1>ItemList Page</h1>
            <ListForm list={currentIdx} />
            <Pagination
                paginate={paginate}
                postOnePage={postOnePage}
                total={list.length}
            />
            <Link to="/items/create">
                <button>등록</button>
            </Link>
        </>
    );
};

export default ItemLilst;
