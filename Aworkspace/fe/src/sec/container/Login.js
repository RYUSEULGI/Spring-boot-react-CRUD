import React, { useState, useEffect } from 'react';
import { useHistory } from 'react-router-dom';
import axios from 'axios';
import '../css/Login.css';

const Login = () => {
    const history = useHistory();
    const [login, setLogin] = useState({});
    const { username, password } = login;

    const fetchUser = () => {
        axios
            .get('http://localhost:8080/users/list')
            .then((res) => {
                console.log(res);
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

    const handleClick = (e) => {
        e.preventDefault();
        axios
            .post('http://localhost:8080/users/login', {
                username,
                password,
            })
            .then((res) => {
                console.log(res);
                localStorage.setItem('token', JSON.stringify(res));
                history.push('/');
            })
            .catch((err) => {
                console.log(err);
                alert('아이디와 비밀번호를 다시 입력해주세요');
            });
    };

    // const activeBtn = password.length >= 8;

    return (
        <form method="post">
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
                <button onClick={handleClick}>Login</button>
            </div>
        </form>
    );
};

export default Login;
