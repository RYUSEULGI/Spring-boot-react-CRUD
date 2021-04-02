import React from 'react';

const ListForm = ({ list }) => {
    return (
        <div class="container">
            <table class="responsive-table">
                <caption>회원리스트</caption>
                <thead>
                    <tr>
                        <th scope="col">회원아이디</th>
                        <th scope="col">회원비밀번호</th>
                        <th scope="col">이메일</th>
                        <th scope="col">회원명</th>
                    </tr>
                </thead>
                <tbody>
                    {list.map((user) => (
                        <tr>
                            <th scope="row">{user.username}</th>
                            <td data-title="Worldwide Gross" data-type="currency">
                                {user.password}
                            </td>
                            <td data-title="Released">{user.email}</td>
                            <td data-title="Studio">{user.name}</td>
                        </tr>
                    ))}
                </tbody>
            </table>
        </div>
    );
};

export default ListForm;
