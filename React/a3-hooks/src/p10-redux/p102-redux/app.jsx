import { useState } from "react";
import { useDispatch, useSelector } from "react-redux";
import { addNotification, removeNotification } from "./redux/action";

export default function P102ReduxApp() {

    const notifications = useSelector(state => state.notifications)
    const dispatch = useDispatch()

    const [message, setMessage] = useState('')
    const [notifType, setNotifType] = useState('info')

    const handleAdd = () => {
        console.log(message)
        if (!message.trim())
            return
        dispatch(addNotification(message, notifType))
        setMessage('')
    }

    return (
        <div>
            <h2>Notification System with Redux</h2>
            <p>
                <input type="text" placeholder="Message" value={message}
                    onChange={e => setMessage(e.target.value)} />
            </p>
            <p>
                <select value={notifType}
                    onChange={e => setNotifType(e.target.value)}>
                    <option value="info">Info</option>
                    <option value="success">Success</option>
                    <option value="error">Error</option>
                    <option value="warning">Warning</option>
                </select>
            </p>
            <p>
                <button onClick={handleAdd}>Add Notification</button>
            </p>
            <div>
                {notifications.length === 0 && <p>No Notifications</p>}
                {console.log(notifications)}
                {notifications.map(({ id, message, notifType }) => (
                    <p key={id}>
                        {notifType} - {message}
                        <button onClick={() => dispatch(removeNotification(id))}>&times;</button>
                    </p>
                ))}
            </div>
        </div>
    )

}