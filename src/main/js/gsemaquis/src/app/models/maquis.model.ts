import { Deserializable } from './deserializable.model';
import { Organisation } from './organisation.model';
import { Pays } from './pays.model';

export class Maquis implements Deserializable {

    id: number;
    raison_sociale: string;
    siteweb: string;
    telephone: string;
    organisation: Organisation;
    pays: Pays;

    deserialize(input: any): this {
        Object.assign(this, input);
        this.organisation = new Organisation().deserialize(input.organisation);
        this.pays = new Pays().deserialize(input.pays);
        return this;
    }
    
}
