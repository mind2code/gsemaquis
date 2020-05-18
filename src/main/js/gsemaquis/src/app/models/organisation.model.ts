import { Deserializable } from './deserializable.model';

export class Organisation implements Deserializable {

    id: number;
    raison_sociale: string;
    adresse_geographique: string;
    siteweb: string;
    telephone: string;

    deserialize(input: any): this {
        Object.assign(this, input);
        return this;
    }
}
