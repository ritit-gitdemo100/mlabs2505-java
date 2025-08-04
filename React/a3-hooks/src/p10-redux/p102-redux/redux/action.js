
export const ADD_NOTIFICATION = "ADD_NOTIFICATION"
export const REMOVE_NOTIFICATION = 'REMOVE_NOTIFICATION'

export const addNotification = (message, notifType) => ({
    type: ADD_NOTIFICATION,
    payload: {
        id: Date.now(),
        message,
        notifType
    }
});

export const removeNotification = (id) => ({
    type: REMOVE_NOTIFICATION,
    payload: id
});