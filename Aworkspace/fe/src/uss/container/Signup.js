import React, { useState } from 'react';
import axios from 'axios';
import '../css/Signup.css';

const Signup = () => {
    const [userInfo, setUserInfo] = useState({
        username: '',
        password: '',
        name: '',
        email: '',
    });

    const { username, password, name, email } = userInfo;

    const handleChange = (e) => {
        const { value, name } = e.target;
        setUserInfo({
            ...userInfo,
            [name]: value,
        });
    };

    const handleSubmit = (e) => {
        console.log('전송');
        e.preventDefault();
        axios
            .post('http://localhost:8080/users', {
                ...userInfo,
            })
            .then((res) => {
                console.log(res);
                alert('회원가압이 완료되었습니다.');
                window.location = '/login';
            })
            .catch((err) => {
                console.log(err);
                alert('회원가압에 실패했습니다. 다시 시도해주세요.');
            });
    };

    return (
        <form onSubmit={handleSubmit} method="post" style={{ border: '1px solid #ccc' }}>
            <div className="container">
                <h1>회원가입</h1>
                <hr />

                <label htmlFor="username">
                    <b>ID</b>
                </label>
                <input type="text" placeholder="id를 입력하세요" name="username" value={username} onChange={handleChange} required />

                <label htmlFor="password">
                    <b>Password</b>
                </label>
                <input type="password" placeholder="비밀번호를 입력하세요" name="password" value={password} onChange={handleChange} required />

                <label htmlFor="name">
                    <b>이름</b>
                </label>
                <input type="text" placeholder="사용자 이름을 입력하세요" name="name" value={name} onChange={handleChange} required />

                <label htmlFor="email">
                    <b>Email</b>
                </label>
                <input type="text" placeholder="이메일주소를 입력하세요" name="email" value={email} onChange={handleChange} required />

                <button type="submit" className="signupbtn">
                    Sign Up
                </button>
            </div>
        </form>
    );
};
export default Signup;
