export interface ITask {
    id?: number;
    title?: string;
    description?: string;
    userLogin?: string;
    userId?: number;
}

export class Task implements ITask {
    constructor(
        public id?: number,
        public title?: string,
        public description?: string,
        public userLogin?: string,
        public userId?: number
    ) {}
}
