import React from 'react';
import { Route, Switch } from 'react-router-dom';
import Home from './cmm/container/Home';
import Counter from './cmm/container/Counter';
import Login from './sec/container/Login';
import Signup from './uss/container/Signup';
import ItemList from './item/component/ItemLilst';
import ItemCreate from './item/component/ItemCreate';
import ItemRead from './item/component/ItemRead';
import ItemUpdate from './item/component/ItemUpdate';
import UserList from './uss/component/UserList';

const App = () => {
    return (
        <Switch>
            <Route exact path="/" component={Home} />
            <Route path="/Counter">
                <Counter />
            </Route>
            <Route path="/login">
                <Login />
            </Route>
            <Route path="/signup">
                <Signup />
            </Route>
            <Route path="/users/list">
                <UserList />
            </Route>
            <Route path="/items/list">
                <ItemList />
            </Route>
            <Route path="/items/item-number/:id" component={ItemRead} />
            <Route
                path="/items/item-number/update/:id"
                component={ItemUpdate}
            />
            <Route path="/items/create">
                <ItemCreate />
            </Route>
        </Switch>
    );
};

export default App;
