import axios from 'axios';

const SERVER = 'http://localhost:8080';

export const userLogin = (loginRequest) =>
    axios.post(`${SERVER}/users/login`, loginRequest);
export const userSignup = (signupRequest) =>
    axios.post(`${SERVER}/users`, signupRequest);
export const fetchItemList = () => axios.get(`${SERVER}/items/list`);
export const createItem = (createItemRequest) =>
    axios.post(`${SERVER}/items`, createItemRequest);
export const fetchItemOne = () => {
    axios.get(`${SERVER}/items/item-number/${localStorage.getItem('select')}`);
};
export const deleteItem = () =>
    axios.delete(
        `${SERVER}/items/item-number/delete/${localStorage.getItem('select')}`
    );
export const updateItem = (updateItemRequest) =>
    axios.put(
        `${SERVER}/items/item-number/update/${localStorage.getItem('select')}`,
        updateItemRequest
    );
