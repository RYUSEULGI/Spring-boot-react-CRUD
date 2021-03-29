import { Link } from 'react-router-dom';
import React from 'react';
import ListForm from './ListForm';

const ItemLilst = () => (
    <>
        <h1>ItemList Page</h1>
        <ListForm />
        <Link to="/items/create">
            <button>등록</button>
        </Link>
    </>
);

export default ItemLilst;
