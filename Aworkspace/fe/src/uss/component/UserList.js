import React, { useState, useEffect } from 'react';
import axios from 'axios';
import ListForm from './ListForm';
import '../css/UserList.css';

const UserList = () => {
    const [list, setList] = useState([]);

    const fetchList = () => {
        axios
            .get('http://localhost:8080/users/list')
            .then((res) => {
                console.log(res);
                setList(res.data);
            })
            .catch((err) => {
                console.log(err);
            });
    };

    useEffect(() => {
        fetchList();
    }, []);

    return (
        <>
            <ListForm list={list} />
        </>
    );
};

export default UserList;
