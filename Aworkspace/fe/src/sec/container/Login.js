import React, { useState, useEffect } from 'react';
import axios from 'axios';
import '../css/Login.css';

const Login = () => {
    const [login, setLogin] = useState({});
    const { username, password } = login;

    const fetchUser = () => {
        axios
            .get('http://localhost:8080/users/list')
            .then((res) => {
                console.log(res.data);
                setLogin(res.data);
            })
            .catch((err) => console.log(err));
    };

    useEffect(() => {
        fetchUser();
    }, []);

    const handleChange = (e) => {
        const { value, name } = e.target;
        setLogin({
            ...login,
            [name]: value,
        });
    };

    const handleSubmit = (e) => {
        e.preventDefault();
        axios
            .post('http://localhost:8080/users/login', { ...login })
            .then((res) => {
                console.log(res);
            })
            .catch((err) => console.log(err));
    };

    return (
        <form onSubmit={handleSubmit} method="post">
            <div className="container">
                <label htmlFor="uname">
                    <b>아이디</b>
                </label>
                <input
                    type="text"
                    placeholder="Enter Username"
                    value={username}
                    name="username"
                    onChange={handleChange}
                    required
                />

                <label htmlFor="psw">
                    <b>비밀번호</b>
                </label>
                <input
                    type="password"
                    placeholder="Enter Password"
                    value={password}
                    name="password"
                    onChange={handleChange}
                    required
                />
                <button type="submit">Login</button>
            </div>
        </form>
    );
};

export default Login;
