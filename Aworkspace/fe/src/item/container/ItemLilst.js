import { Link } from 'react-router-dom'
import React from 'react'
import List from '../component/List'

const ItemLilst = () => (
    <>
        <h1>ItemList Page</h1>
        <List/>
        <button>
            <Link to ="/items/create">등록</Link>
        </button>
    </>
)

export default ItemLilst
