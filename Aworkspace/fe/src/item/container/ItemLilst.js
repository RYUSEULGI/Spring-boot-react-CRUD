import { Link } from 'react-router-dom';
import React from 'react';
import List from '../component/List';

const ItemLilst = () => (
    <>
        <h1>ItemList Page</h1>
        <List />
        <Link to="/items/create">
            <button>등록</button>
        </Link>
    </>
);

export default ItemLilst;
