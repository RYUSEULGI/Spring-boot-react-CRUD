import React from 'react';
import { Link, useHistory } from 'react-router-dom';

const Home = () => {
    const formStyle = {
        width: '500px',
        margin: '0 auto',
        paddingTop: '100px',
        textAlign: 'center',
    };

    const history = useHistory();

    return (
        <div style={formStyle}>
            <h1>Main</h1>
            <button onClick={() => history.push('/items/list')}></button>
            <Link to="/signup">회원가입</Link>
            <br />
            <Link to="/login">로그인</Link>
            <br />
            <Link to={'Counter'}>카운터</Link>
            <br />
        </div>
    );
};

export default Home;
